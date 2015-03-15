package com.hysd.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import com.hysd.domain.Eqmedia;
import com.hysd.domain.page.Page;
import com.hysd.service.EqmediaService;

@Controller
public class EqmediaAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(EqmediaAction.class);
	private Page<Eqmedia> page = new Page<Eqmedia>();
	private Map<String, Object> param;
	private String message;
	private Eqmedia eqmedia;
	private Long id;
	@Resource
	private EqmediaService eqmediaService;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Eqmedia getEqmedia() {
		return eqmedia;
	}

	public void setEqmedia(Eqmedia eqmedia) {
		this.eqmedia = eqmedia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Page<Eqmedia> getPage() {
		return page;
	}

	public void setPage(Page<Eqmedia> page) {
		this.page = page;
	}

	public Map<String, Object> getParam() {
		return param;
	}

	public void setParam(Map<String, Object> param) {
		this.param = param;
	}

	public String save() {
		log.debug("START: EqeqeqmediaAction-save()");
		eqmediaService.save(eqmedia);
		message = "ok";
		log.debug("END  : EqeqeqmediaAction-save()");
		return "save";
	}

	public String edit() {
		log.debug("START: EqeqeqmediaAction-edit()");
		eqmediaService.save(eqmedia);
		message = "ok";
		log.debug("END  : EqeqeqmediaAction-edit()");
		return "edit";
	}

	public String load() {
		log.debug("START: EqeqeqmediaAction-load()");
		eqmedia = eqmediaService.findById(id);
		log.debug("END  : EqeqeqmediaAction-load()");
		return "load";
	}

	public String list() {
		log.debug("START: EqeqeqmediaAction-list()");
		if(param==null){
			param=new HashMap<String, Object>();
		}
		// 获取页面的参数
		page = eqmediaService.list(page, param);
		log.debug("END  : EqeqeqmediaAction-list()");
		return "list";
	}

}