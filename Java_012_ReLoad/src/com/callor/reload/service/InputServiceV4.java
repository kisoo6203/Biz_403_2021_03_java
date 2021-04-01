package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV4 {

	Scanner scan;
	List<NumberVO> numList;
	
	public InputServiceV4(){
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
		
	}
	public void InputNum() {

		System.out.print("정수입력 >> ");
		String strNum1 = scan.nextLine();
		Integer intNum1 = Integer.valueOf(strNum1);
			
		System.out.print("정수입력 >> ");
		String strNum2 = scan.nextLine();
		Integer intNum2 = Integer.valueOf(strNum2);
		
		NumberVO numberVO = new NumberVO();
		numberVO.setNum1(intNum1);
		numberVO.setNum2(intNum2);
		
		numList.add(numberVO);
		
	}
	public void printNum() {
		
		for(int i = 0 ; i < numList.size() ; i++) {
			NumberVO vo = numList.get(i);
			
			// System.out.println(vo.getNum1() + "\t");
			// System.out.println(vo.getNum2());
			this.printNum(vo);
		}
	}
	public void printNum(NumberVO vo) {
		
		System.out.println(vo.getNum1() + "\t");
		System.out.println(vo.getNum2());
		
	}
}
