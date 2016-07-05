<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/WEB-INF/common/head.jsp"%>
<link rel="stylesheet" style="text/css"
	href="<%=basePath%>resources/css/train-result.css" />
<script src="<%=basePath%>resources/highstock/highcharts.js"></script>
<script src="<%=basePath%>resources/highstock/exporting.js"></script>
<script type="text/javascript">
$(function(){
	//highcharts
	chart = new Highcharts.Chart({
	      chart: {
	        renderTo: 'chart'
	      },
	      credits : {
	            enabled:false//不显示highCharts版权信息
	      },
	      title:{
	        text:"时间-速度曲线图"
	      },
	        yAxis: [
	        {
	            title:{
	                text :'Speed (km/h)'
	            },
	            lineWidth : 1
	            
	        },
	        {
	            title:{
	                   text :'slope(‰)'
	               },
	            lineWidth : 1,
	            opposite:true
	        },
	        ],
	      xAxis: {
	        type: 'datetime',
	        dateTimeLabelFormats: {
	            day: '%H:%M:%S:%L'
	        }
	      },
	      tooltip:{
	            xDateFormat: '%H:%M:%S.%L',
	            shared: true
	      },
/* 	      series:[{
		        name: 'speed',
		        data: [],
	  	        pointInterval: 200
		    }, {
		        name: 'slope',
		        data: [],
	  	        pointInterval: 200
		    }] */
		    series:[]
	  });
	    /* chart2 = new Highcharts.Chart({
	        chart: {
	          renderTo: 'chart2'
	        },
	        title: {
	            text: '距离-速度曲线图'
	        },
	        credits: {
	          enabled:false //去水印
			},
	          yAxis: [
	          {
	              title:{
	                  text :'Speed (km/h)'
	              },
	              lineWidth : 1
	              
	          },
	          {
	              title:{
	                     text :'slope(‰)'
	                 },
	              lineWidth : 1,
	              opposite:true
	          },
	          ],
	        xAxis: {
	        },
	        tooltip:{
	              shared: true
	        },
	        series:[{
	  	        name: 'speed',
	  	        data: []
	  	    }, {
	  	        name: 'slope',
	  	        data: []
	  	    }]
	    }); */
	  //下拉框
		$.ajax({
			type:"POST",
			url:"<%=basePath%>index/contrastEnergySections",
			dataType: "json",
			success: function(data){
				$.each(data, function (n, value) {
					var sectionid = value.id;
					$("#selectContainer").append("<select class='form-control' style='width: 500px' id="+sectionid+"><option>请选择</option>");
					$.each(value.energySections, function (m, value2) {
						$("#"+sectionid).append("<option value="+value2.id+">"+value2.start+"---"+m+"----"+value2.end+"["+value2.info+"]"+"</option>");
					});
					$("#selectContainer").append("</select>");	
		          });
				$(".form-control").change(function(){
					var selectId = $(this).val();
					var chart3 = $('#chart').highcharts();
					$.ajax({
						type:"POST",
						url:"<%=basePath%>index/getEnergySection",
						data : {
							id : selectId
						},
						dataType : "json",
						success : function(data) {
							$.each(data, function(n, value) {
								var name_temp = value.name;
								var temp2 = value.vodata;
								var temp3 = value.slope;
								if(chart3.get(name_temp+"-speed")!=null){
									chart3.get(name_temp+"-speed").remove();
								}
								if(chart3.get(name_temp+"-slope")!=null){
									chart3.get(name_temp+"-slope").remove();
								}
								chart3.addSeries({
									id:name_temp+"-speed",
						            name: name_temp+"-speed",
						            data: temp2,
						            pointInterval: 200
						        });
								chart3.addSeries({
									id:name_temp+"-slope",
						            name: name_temp+"-slope",
						            data: temp3,
						            pointInterval: 200
						        });
							});
						}
					});
			    });
			}
			});
});
$(function () {
	$.ajax({
		type:"POST",
		url:"<%=basePath%>index/getEnergySectionField",
		dataType: "json",
		success : function(data) {
			$.each(data, function(n, value) {
				$("#dataItem").append("<div style='height:50px'><div class='col-md-3'>"+value.info+"</div>"+"<div class='col-md-4'>"+"<"+value.start+","+value.end+">"+"</div>"+"<div class='col-md-1'>"+value.runtime+"</div>"+
						"<div class='col-md-1'>"+value.maxacceleration+","+value.minusacceleration+"</div>"+"<div class='col-md-1'>"+value.maxaccelerationRate+","+value.minusaccelerationRate+"</div>"+
						"<div class='col-md-1'>(<+-0.3)</div>"+"<div class='col-md-1'>"+value.ebi+"</div></div>");
			});
		}
		});
});

</script>
</head>
<body data-spy="scroll" data-target="#myScrollspy">
	<div class="container">
		<h2>列车能耗评估系统</h2>
		<hr>
		<br>
		<div class="row">
			<div class="col-md-2">
				<ul class="nav nav-pills nav-stacked">
					<li class="active"><a href="<%=basePath%>/index/upload">列车能耗评估系统</a></li>
<%-- 					<li><a href="<%=basePath%>index/contrast">列车对比</a></li>
					<li><a href="#">****系统</a></li> --%>
				</ul>
			</div>
			<div class="col-md-10">
				<h2>站间信息</h2>
				<div id="selectContainer"></div>
				<h3 id="section-1">以时间为依据</h3>
				<div id="chart" style="min-width: 700px; height: 400px"></div>
				<hr>
<!-- 				<h3 id="section-2">以距离为依据</h3>
				<div id="chart2" style="min-width: 700px; height: 400px"></div>
				<hr> -->
				<h3 id="section-3">统计</h3>
				<br>
				<p>
					<%-- ${data } --%>
				</p>
				<div class="row">
					<div class="col-md-12" style="text-align: center; font-size: 20px;">
						<strong>基本数据统计</strong>
					</div>
				</div>
				<br>
				<div class="row"
					style="border-bottom: 1px solid #CCC; padding-bottom: 10px;">
					<div class="col-md-3">
						<strong>文件名称</strong>
					</div>
					<div class="col-md-4">
						<strong>站间</strong>
					</div>
					<div class="col-md-1">
						<strong>实际运行时间(s)</strong>
					</div>
					<div class="col-md-1">
						<strong>最大加速度(m/s<sup>2</sup>)
						</strong>
					</div>
					<div class="col-md-1">
						<strong>最大加速度变化率(m/ts<sup>2</sup>)
						</strong>
					</div>
					<div class="col-md-1">
						<strong>停车精度(m)(<+-0.3)</strong>
					</div>
					<div class="col-md-1">
						<strong>EBI速度限制触发次数</strong>
					</div>
				</div>
				<div class="row" id="dataItem"
						style="border-bottom: 1px solid #CCC; padding-bottom: 10px;">
						
					</div>
				<c:forEach items="${trains}" var="train" varStatus="status">
					<div class="row"
						style="border-bottom: 1px solid #CCC; padding-bottom: 10px;">
						<div class="col-md-2">${train.file}</div>
						<div class="col-md-2">${train.runingTime}</div>
						<div class="col-md-2">${train.maxAcceleration}(正)<br>${train.minusAcceleration}(负)</div>
						<div class="col-md-2">${train.maxAcceleration_rate}(正)<br>${train.minusAcceleration_rate}(负)</div>
						<div class="col-md-2">${train.stationPrecision }</div>
						<div class="col-md-2">${train.EBInum }</div>
					</div>
					<br>
					<c:if test="${fn:length(trains) == 1 }">
						<div class="row">
							<div class="col-md-12"
								style="text-align: center; font-size: 20px;">
								<strong>不同阶段的用能情况统计</strong>
							</div>
						</div>
						<br>
						<div class="row"
							style="border-bottom: 1px solid #CCC; padding-bottom: 10px;">
							<c:forEach items="${train.energySection}" var="energySection">
								<c:if test="${fn:split(energySection.info,',')[0] != '0x10d'}">
									<div class="col-md-2">
										[${energySection.start },${energySection.end }]此
										<c:if test="${energySection.info == '3'}">
											惰行区间内产生的能量
										</c:if>
										<c:if test="${energySection.info == '2'}">
											制动区间内产生的再生能量
										</c:if>
										<c:if test="${energySection.info == '1'}">
											牵引区间内产生的牵引能量
										</c:if>
										为${energySection.energe }
									</div>
								</c:if>
							</c:forEach>
						</div>
					</c:if>
				</c:forEach>
				<hr>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">


</script>
</html>
