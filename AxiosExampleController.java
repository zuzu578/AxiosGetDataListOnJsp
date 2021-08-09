	@RequestMapping("boardList")
	public String boardList(HttpServletRequest req , Model model) {
		
		System.out.println("test");
		return "test";
	}
	
	@RequestMapping("/getTestData")
	@ResponseBody
	public List<Dto> getTestData(HttpServletRequest req) {
		Dao dao = sqlSession.getMapper(Dao.class);
		List<Dto> dtos = dao.BoardList();
		
		System.out.println("getTestData() called! ");
		
		return dtos;
		
	}
