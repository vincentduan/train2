package bjtu.edu.train.dao;

import bjtu.edu.train.model.TrainData;
import bjtu.edu.train.model.TrainDataExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TrainDataMapper {
    int countByExample(TrainDataExample example);

    int deleteByExample(TrainDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TrainData record);

    int insertSelective(TrainData record);

    List<TrainData> selectByExample(TrainDataExample example);

    TrainData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TrainData record, @Param("example") TrainDataExample example);

    int updateByExample(@Param("record") TrainData record, @Param("example") TrainDataExample example);

    int updateByPrimaryKeySelective(TrainData record);

    int updateByPrimaryKey(TrainData record);
    
    void addTrainRecordBatch(List<TrainData> trainDataList);
    
    @Select("TRUNCATE TABLE train_data")
    void deleteAll();
}