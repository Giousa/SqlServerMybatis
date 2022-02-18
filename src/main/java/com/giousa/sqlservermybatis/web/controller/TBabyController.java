package com.giousa.sqlservermybatis.web.controller;

import com.giousa.sqlservermybatis.convert.TBabyConvert;
import com.giousa.sqlservermybatis.core.model.TBabyDO;
import com.giousa.sqlservermybatis.manager.TBabyManager;
import com.giousa.sqlservermybatis.utils.WrapperTemplate;
import com.giousa.sqlservermybatis.web.dto.TBabyDTO;
import com.giousa.sqlservermybatis.web.req.TBabyReq;
import com.giousa.sqlservermybatis.web.req.page.PageQueryTBabyReq;
import com.giousa.sqlservermybatis.web.request.IdReq;
import com.giousa.sqlservermybatis.web.result.PageBeanVO;
import com.giousa.sqlservermybatis.web.result.ResultVO;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.stream.Collectors;

@RestController
@RequestMapping("tBabyApi")
public class TBabyController {

    @Resource
    private TBabyManager tBabyManager;

    /**
     * 添加
     *
     * @param req
     * @return
     */
    @PostMapping("addTBaby")
    public ResultVO<Boolean> addTBaby(@RequestBody TBabyReq req) {
        return WrapperTemplate.execute(() -> {
            tBabyManager.insert(TBabyConvert.convert(req));
            return ResultVO.ok(true);
        }, TBabyController.class, "TBaby", req);
    }

    /**
     * 更新
     *
     * @param req
     * @return
     */
    @PostMapping("updateTBaby")
    public ResultVO<Boolean> updateTBaby(@RequestBody TBabyReq req) {
        return WrapperTemplate.execute(() -> {
            tBabyManager.update(TBabyConvert.convert(req));
            return ResultVO.ok(true);
        }, TBabyController.class, "updateTBaby", req);
    }

    /**
     * 删除
     *
     * @param req
     * @return
     */
    @PostMapping("deleteTBabyById")
    public ResultVO<Boolean> deleteTBabyById(@RequestBody IdReq req) {
        return WrapperTemplate.execute(() -> {
            tBabyManager.delete(req.getId());
            return ResultVO.ok(true);
        }, TBabyController.class, "deleteTBabyById", req);
    }

	/**
     * 查询详情
     *
     * @param req
     * @return
     */
    @PostMapping("findTBabyById")
    public ResultVO<TBabyDTO> findTBabyById(@RequestBody IdReq req) {
        return WrapperTemplate.execute(() -> {
            TBabyDO tBabyDO = tBabyManager.findById(req.getId());
            return ResultVO.ok(TBabyConvert.convert(tBabyDO));
        }, TBabyController.class, "findTBabyById", req);
    }

    /**
     * 分页查询
     *
     * @param req
     * @return
     */
    @PostMapping("findTBabyByPage")
    public ResultVO<PageBeanVO<TBabyDTO>> findTBabyByPage(@RequestBody PageQueryTBabyReq req) {
        return WrapperTemplate.execute(() -> {
            PageBeanVO<TBabyDTO> result = new PageBeanVO<>();
            PageBeanVO<TBabyDO> pageBeanVO = tBabyManager.findByPage(req);
            result.setTotalCount(pageBeanVO.getTotalCount());
            result.setPageNum(pageBeanVO.getPageNum());
            result.setPageSize(pageBeanVO.getPageSize());
            result.setTotalPage(pageBeanVO.getTotalPage());
            result.setData(CollectionUtils.isEmpty(pageBeanVO.getData()) ? null : pageBeanVO.getData()
                    .parallelStream()
                    .map(TBabyConvert::convert)
                    .collect(Collectors.toList()));
            return ResultVO.ok(result);
        }, TBabyController.class, "findTBabyByPage", req);
    }

}


