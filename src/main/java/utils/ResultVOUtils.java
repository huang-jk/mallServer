package utils;

import com.example.demo.VO.ResultVO;

import java.util.Objects;

/**
 * Created by Administrator on 2019/11/24.
 */
public class ResultVOUtils {

    public static ResultVO success(Object object) {
        ResultVO resultVo = new ResultVO();
        resultVo.setCode("0");
        resultVo.setMessage("成功");
        resultVo.setData(object);
        return resultVo;
    }

    public static ResultVO error(Object object) {
        ResultVO resultVo = new ResultVO();
        resultVo.setCode("1");
        resultVo.setMessage("失败");
        resultVo.setData(object);
        return resultVo;
    }
}
