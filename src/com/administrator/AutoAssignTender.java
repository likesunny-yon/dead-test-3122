package com.administrator;

import java.util.Scanner;

import com.exception.CredentialException;
import com.exception.TenderException;
import com.method.Methods;
import com.method.Methods_Impl;



public class AutoAssignTender {
//	This Method is for assaigning the tender to the venders

	public void getMaxBid(int id) throws TenderException, CredentialException{
		System.out.println(":---------------------------: Assign Tender");
		Methods methods_implemen=new Methods_Impl();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter TenderID: ");
		int Tid=sc.nextInt();
		int[] arr=methods_implemen.MaxBid(Tid);
		if(arr.length!=0) {
			int Vid=arr[0];
			int BidPrice=arr[1];
			methods_implemen.AssignTender(Tid, Vid, BidPrice);
		}
		AdminMenu admin_menu=new AdminMenu();
		admin_menu.Amenu(id);
		sc.close();
	}
}
