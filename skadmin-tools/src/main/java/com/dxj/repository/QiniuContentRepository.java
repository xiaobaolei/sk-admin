package com.dxj.repository;

import com.dxj.domain.QiniuContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author jie
 * @date 2018-12-31
 */
public interface QiniuContentRepository extends JpaRepository<QiniuContent, Long>, JpaSpecificationExecutor<QiniuContent> {

    /**
     * 根据key查询
     * @param key
     * @return
     */
    QiniuContent findByKey(String key);
}
