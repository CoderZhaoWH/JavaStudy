package javaStudy.tools.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import javaStudy.tools.mybatis.entity.HealthCareMedicineDirectory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author dhslegen
 * @since 2020-06-12
 */
public interface HealthCareMedicineDirectoryMapper extends BaseMapper<HealthCareMedicineDirectory> {

    /**
     * list
     *
     * @param directoryMedicineCode directoryMedicineCode
     * @param directoryPkNo         directoryPkNo
     * @param directoryType         directoryType
     * @return list
     */
    List<HealthCareMedicineDirectory> getByMedicineCode(@Param("directoryMedicineCode") String directoryMedicineCode, @Param("directoryPkNo") Integer directoryPkNo, @Param("directoryType") String directoryType);
}
