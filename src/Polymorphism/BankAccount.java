package Polymorphism;

import java.io.File;

import Polymorphism.OverrideVsOverloadDemo.Archiver;
import Polymorphism.OverrideVsOverloadDemo.RarArchiver;
import Polymorphism.OverrideVsOverloadDemo.ZipArchiver;

/**
 * 
 * @author Aronno
 *
 */
public class BankAccount {

	public static void main(String[] args) {
		
		User contentManager = new ContentManager();
		User admin = new AdminUser();
		
		contentManager.validateAccessRights();
		admin.validateAccessRights();
		
		System.out.println();
		System.out.println("==============");
		System.out.println();
		
		Archiver zipArchiver = new ZipArchiver();
		Archiver rarArchiver = new RarArchiver();
		
		zipArchiver.archiveFiles(new File(""));
		rarArchiver.archiveFiles(new File(""));
		
		System.out.println();
		System.out.println("==============");
		System.out.println();
		
		contentManager.getProfileInformtaion(new UserProfile());

	}

}