package com.giousa.sqlservermybatis.manager;

import com.giousa.sqlservermybatis.core.mapper.TBabyMapper;
import com.giousa.sqlservermybatis.core.model.TBabyDO;
import com.giousa.sqlservermybatis.utils.DataHandlerUtils;
import com.giousa.sqlservermybatis.web.req.BaseReq;
import com.giousa.sqlservermybatis.web.req.PageQueryReq;
import com.giousa.sqlservermybatis.web.result.PageBeanVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Component
public class TBabyManager {

    @Resource
    private TBabyMapper tBabyMapper;

    public void insert(TBabyDO tBabyDO) {
        if (tBabyMapper.insert(tBabyDO) < 1) {
            log.warn("insert. tBabyDO: {}", tBabyDO);
        }
    }

    public void update(TBabyDO tBabyDO) {
        if (tBabyMapper.update(tBabyDO) < 1) {
            log.warn("update. tBabyDO: {}", tBabyDO);
        }
    }

	public int delete(Long id) {
        return tBabyMapper.delete(id);
    }

    public TBabyDO findById(Long id) {
        return tBabyMapper.findById(id);
    }

    public PageBeanVO<TBabyDO> findByPage(PageQueryReq req) {
        int totalCount = tBabyMapper.countPageQuery(req);
        List<TBabyDO> list = null;
        if (totalCount > 0) {
            list = tBabyMapper.pageQuery(req);
        }
        return DataHandlerUtils.handlePage(list, req.getPage(), req.getSize(), totalCount);
    }

	public List<TBabyDO> findByBaseReq(BaseReq req) {
        return tBabyMapper.findByBaseReq(req);
    }
}


