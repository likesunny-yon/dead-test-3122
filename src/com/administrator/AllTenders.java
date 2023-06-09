package com.administrator;

import java.util.List;

import com.exception.CredentialException;
import com.exception.TenderException;
import com.method.Methods;
import com.method.Methods_Impl;
import com.models.Tender;


public class AllTenders {
//	This Methods is for getting all the Tenders which are available

	public void getTenders(int id) throws TenderException, CredentialException{
		System.out.println(":------------------------------: All Tenders");
		Methods methods_implemen=new Methods_Impl();
		List<Tender> list=methods_implemen.GetAllTenders();
		for(Tender i:list) {
			System.out.println("Tender ID       : "+i.getId());
			System.out.println("Tendor Name     : "+i.getName());
			System.out.println("tender Type     : "+i.getType());
			System.out.println("Tender MinAmount: "+i.getAmount());
			if(i.getStatus()==1) {
				System.out.println("Tender Status   : Closed");
			}else {
				System.out.println("Tender Status   : Open");
			}
			System.out.println("Tender BidPrice : "+i.getBidPrice());
			System.out.println("Vendor ID       : "+i.getVid());
			System.out.println(":------------------------------------------:");
		}
		AdminMenu admin_menu=new AdminMenu();
		admin_menu.Amenu(id);
	}
}
