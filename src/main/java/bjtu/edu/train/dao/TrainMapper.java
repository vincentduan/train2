package bjtu.edu.train.dao;

import bjtu.edu.train.model.Train;
import bjtu.edu.train.model.TrainExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TrainMapper {
    int countByExample(TrainExample example);

    int deleteByExample(TrainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Train record);

    int insertSelective(Train record);

    List<Train> selectByExample(TrainExample example);

    Train selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Train record, @Param("example") TrainExample example);

    int updateByExample(@Param("record") Train record, @Param("example") TrainExample example);

    int updateByPrimaryKeySelective(Train record);

    int updateByPrimaryKey(Train record);
    
	@Select("TRUNCATE TABLE train")
    void deleteAll();
}