package com.qm.spring.boot.blog.personblog;

import static org.assertj.core.api.Assertions.assertThat;
import com.qm.spring.boot.blog.personblog.repository.es.EsBolgRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class EsBlogControllerTest {
	@Autowired
	private EsBolgRepository bolgRepository;

//	@Test
//	public void testFindByTitleLikeOrContentLike() {
//		// 清空所有
//		bolgRepository.deleteAll();
//
//		bolgRepository.save(new Blog("1","老卫跟你谈谈安装 Elasticsearch",
//				"关于如何来安装 Elasticsearch，这个请看我的博客 https://waylau.com"));
//		bolgRepository.save(new EsBolg("2","老卫跟你谈谈 Elasticsearch 的几个用法",
//				"关于如何来用 Elasticsearch，还是得看我的博客 https://waylau.com，妹"));  // 关键字"妹"
//		bolgRepository.save(new EsBolg("3","老卫和你一起学 Elasticsearch",
//				"如何来学习 Elasticsearch，最终看我的博客 https://waylau.com，酒")); // 关键字"酒"
//
//		bolgRepository.save(new EsBolg("4","03-05 用大白话聊聊分布式系统",
//				"一提起“分布式系统”，大家的第一感觉就是好高大上啊，深不可测"));
//		bolgRepository.save(new EsBolg("5","02-19 Thymeleaf 3 引入了新的解析系统",
//				"如果你的代码使用了 HTML5 的标准，而Thymeleaf 版本来停留在 2.x ，那么如果没有把闭合"));
//		bolgRepository.save(new EsBolg("6","02-19 使用 GFM Eclipse 插件时，不在项目里面生成 HTML 文件",
//				"GFM 是 GitHub Flavored Markdown Viewer 的简称，是一款对 GitHub 友好的 Markdown 编辑器 。"));
//
//		Pageable pageable = new PageRequest(0, 20);
//		Page<EsBolg> page = bolgRepository.
//				findDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining("5",
//						"大白话", "如果", pageable);
//		assertThat(page.getTotalElements()).isEqualTo(5);
//
//		for (EsBolg bolg : page.getContent()) {
//			System.out.println(bolg.getContent());
//		}
//	}


}
