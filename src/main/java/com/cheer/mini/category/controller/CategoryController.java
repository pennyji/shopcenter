package com.cheer.mini.category.controller;


import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("pms/category")
public class CategoryController {
	
	
	
	
	
	
	/*@Autowired
	private CategoryService categoryService;
	shopcenter/page/desc.jsp
	@RequestMapping("/")
	 public ModelAndView commdity(final HttpServletRequest request, final HttpServletResponse response) {
	     
		 ModelAndView mv = new ModelAndView("");
	        return mv;
	 }
	
	@RequestMapping("")
	public List<Category> findAll() {
		
		return null;
	}
	
	private Category toCategory(Map<String,Object> map) {
		Category category = CommonUtils.toBean(map, Category.class);
		String pid = (String)map.get("pid");
		if(pid != null) {
			Category parent = new Category();
			parent.setCid(pid);
			category.setParent(parent);
		}
		return category;
	}
	
	private List<Category> toCategoryList(List<Map<String,Object>> mapList) {
		List<Category> categoryList = new ArrayList<Category>();
		for(Map<String,Object> map :mapList) {
			Category c = toCategory(map);
			categoryList.add(c);
		}
		return categoryList;
	}
	private List<Category> findByParent(String pid) {
		return null;
	}
*/
	
	
}
