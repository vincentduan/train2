package bjtu.edu.train.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import bjtu.edu.train.model.EnergySection;
import bjtu.edu.train.model.EnergySectionExample;

public interface EnergySectionMapper {
    int countByExample(EnergySectionExample example);

    int deleteByExample(EnergySectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EnergySection record);

    int insertSelective(EnergySection record);

    List<EnergySection> selectByExample(EnergySectionExample example);

    EnergySection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EnergySection record, @Param("example") EnergySectionExample example);

    int updateByExample(@Param("record") EnergySection record, @Param("example") EnergySectionExample example);

    int updateByPrimaryKeySelective(EnergySection record);

    int updateByPrimaryKey(EnergySection record);
    
    void addEnergyRecordBatch(List<EnergySection> energySections);
    
    @Select("TRUNCATE TABLE energysection")
    void deleteAll();
}