package classroomRental.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import classroomRental.dto.BoardDto;
import classroomRental.dto.SeungyeonDto;
import classroomRental.dto.SurveyDto;
import classroomRental.dto.User;
import classroomRental.mapper.BoardInfo;
import classroomRental.mapper.DepartmentInfo;
import classroomRental.mapper.IcheoneunuchInfo;
import classroomRental.mapper.IlmangwanInfo;
import classroomRental.mapper.MigaelgwanInfo;
import classroomRental.mapper.MillenniumcenterInfo;
import classroomRental.mapper.SaintMichaelInfo;
import classroomRental.mapper.SeungyeonInfo;
import classroomRental.mapper.SurveyInfo;
import classroomRental.mapper.UserInfo;
import classroomRental.mapper.WoldanggwanInfo;
import classroomRental.service.SeungyeonInfoService;
import classroomRental.service.UserService;

@Controller
@RequestMapping("view")
public class LectureroomController {

	@Autowired
	private SurveyInfo surveyInfo;
	@Autowired
	private BoardInfo boardInfo;
	@Autowired
	private SeungyeonInfo seungyeonInfo;
	@Autowired
	private IlmangwanInfo ilmangwanInfo;
	@Autowired
	private WoldanggwanInfo woldanggwanInfo;
	@Autowired
	private IcheoneunuchInfo icheoneunuchInfo;
	@Autowired
	private MillenniumcenterInfo millenniumcenterInfo;
	@Autowired
	private SaintMichaelInfo saintMichaelInfo;
	@Autowired
	private MigaelgwanInfo migaelgwanInfo;
	@Autowired
	private SeungyeonInfoService seungyeonInfoService;
	@Autowired
	private UserInfo userInfo;
	@Autowired
	private DepartmentInfo departmentInfo;
	@Autowired 
	UserService userService;
	
	@RequestMapping("login")
	public String login()
	{
		return "view/login";
	}
	
	@RequestMapping(value="loginAfter", method=RequestMethod.POST)
	public String loginAfter(User user,Model model)
	{
		model.addAttribute("user",userInfo.selectByLoginId(user.getLoginId()));
		return "view/signUpAfter";
	}
		
	@RequestMapping("signUpBefore")
	public String loginGo() {
		return "view/signUpBefore";
	}

	@RequestMapping(value="signUpAfter", method=RequestMethod.POST)
	public String membership(User user,Model model)
	{
		userInfo.insert(user);
		return "view/signUpAfter";
	}

	@RequestMapping(value = "edit", method = RequestMethod.GET)
	public String loginModification(User user,Model model) {
		model.addAttribute("user", userInfo.selectByLoginId(user.getLoginId()));
		return "view/edit";
	}

//	@RequestMapping(value = "edit", method = RequestMethod.POST)
//	public String loginModification(User user, Model model) {
//		String message = userService.validateBeforeUpdate(user);
//		if (message == null) {
//			userInfo.update(user);
//			model.addAttribute("success", "저장했습니다.");
//		} else
//			model.addAttribute("error", message);
//		model.addAttribute("departments", departmentInfo.selectAll());
//		return "view/edit";
//	}

	@RequestMapping("/questionnaireInfo")
	public String test() {
		return "view/questionnaireInfo";
	}

	@RequestMapping("classroomInfo")
	public String test1() {
		return "view/classroomInfo";
	}

	@RequestMapping(value="signUpAfter" , method=RequestMethod.GET)
	public String test2(Model model) {
		return "view/signUpAfter";
	}

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String test3(Model model) {
		model.addAttribute("board", boardInfo.selectAll());
		return "view/list";
	}

	@RequestMapping(value = "list", method = RequestMethod.POST)
	public String test3(BoardDto board, Model model) {
		boardInfo.update(board);
		return "redirect:list";
	}

	@RequestMapping("writeForm")
	public String test4() {
		return "view/writeForm";
	}

	@RequestMapping("write")
	public String test5(BoardDto board) {
		// 쓰고 목록으로 넘어가기
		boardInfo.insert(board);
		return "redirect:list";
	}

	@RequestMapping("update")
	public String update(BoardDto board, Model model) {
		//123123
		model.addAttribute("board", boardInfo.select(board));
		return "view/edit";
	}

	@RequestMapping("delete")
	public String delete(HttpServletRequest request) {
		boardInfo.delete(request.getParameter("id"));
		return "redirect:list";
	}

	@RequestMapping("transmit")
	public String test6(SurveyDto survey) {
		// 설문지작성하고 맨 처음화면으로 가기
		surveyInfo.insert(survey);
		return "redirect:signUpAfter";
	}

	@RequestMapping(value = { "seungyeon", "seung" }, method = RequestMethod.GET)
	public String classroomSeungyeon(SeungyeonDto seungyeonDto, Model model) {
		if (seungyeonInfoService.dataSeungyeon(seungyeonDto) == null) {
			model.addAttribute("mmm", seungyeonInfoService.dataSeungyeon(seungyeonDto));
		}
		model.addAttribute("seungyeon", seungyeonInfo.selectAll());
		return "view/classroomInfo";
	}

	@RequestMapping(value = "ilmangwan", method = RequestMethod.GET)
	public String classroomIlmangwan(Model model) {
		model.addAttribute("ilmangwan", ilmangwanInfo.selectAll());
		return "view/classroomInfo";
	}

	@RequestMapping("woldanggwan")
	public String classroomWoldanggwan(Model model) {
		model.addAttribute("woldang", woldanggwanInfo.selectAll());
		return "view/classroomInfo";
	}

	@RequestMapping("yeollamgwan")
	public String classroomYeollamgwan(Model model) {
		model.addAttribute("message", "정보가없습니다.");
		return "view/classroomInfo";
	}

	@RequestMapping("icheoneunuch")
	public String classroomIcheoneunuch(Model model) {
		model.addAttribute("icheon", icheoneunuchInfo.selectAll());
		return "view/classroomInfo";
	}

	@RequestMapping("millenniumcenter")
	public String classroomMillenniumcenter(Model model) {
		model.addAttribute("mill", millenniumcenterInfo.selectAll());
		return "view/classroomInfo";
	}

	@RequestMapping("saintMichael")
	public String classroomSaintMichael(Model model) {
		model.addAttribute("saint", saintMichaelInfo.selectAll());
		return "view/classroomInfo";
	}

	@RequestMapping("Migaelgwan")
	public String classroomMigaelgwan(Model model) {
		model.addAttribute("migael", migaelgwanInfo.selectAll());
		return "view/classroomInfo";
	}

	@RequestMapping("schoolyard")
	public String classroomSchoolyard(Model model) {
		model.addAttribute("mes", "정보가 없습니다");
		return "view/classroomInfo";
	}
}