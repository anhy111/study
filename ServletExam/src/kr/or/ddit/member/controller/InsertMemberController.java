package kr.or.ddit.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.common.service.AtchFileServiceImpl;
import kr.or.ddit.common.service.IAtchFileService;
import kr.or.ddit.common.vo.AtchFileVO;
import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVO;

@MultipartConfig
@WebServlet("/member/insert.do")
public class InsertMemberController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		req.getRequestDispatcher("/view/member/InsertForm.jsp")
			.forward(req, resp);
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		req.setCharacterEncoding("utf-8");
		
		// 1. 파라미터 데이터 가져오기
		String memId = req.getParameter("memId");
		String memName = req.getParameter("memName");
		String memTel = req.getParameter("memTel");
		String memAddr = req.getParameter("memAddr");
		
		// 2. 서비스 객체 생성하기
		IMemberService memberService = MemberServiceImpl.getInstance();
		IAtchFileService fileService = AtchFileServiceImpl.getInstance();
		
		// 첨부파일 저장하기
		AtchFileVO atchFileVO = fileService.saveAtchFileList(req);
		
		
		// 3. 회원정보 등록하기
		MemberVO mv = new MemberVO();
		mv.setMemId(memId);
		mv.setMemName(memName);
		mv.setMemTel(memTel);
		mv.setMemAddr(memAddr);
		mv.setAtchFileId(atchFileVO.getAtchFileId());
		int result = memberService.registerMember(mv);
		
		String msg = "";
		if(result > 0) {
			// 성공
			msg = "성공";
		} else {
			// 실패
			msg = "실패";
		}
		
		HttpSession session = req.getSession();
		session.setAttribute("msg", msg);
		
		// 4. 목록 조회 화면으로 이동
//		req.getRequestDispatcher("/member/list.do").forward(req, resp);
		
		String redirectUrl = req.getContextPath() + "/member/list.do";
		
		resp.sendRedirect(redirectUrl);
		
	}
}
