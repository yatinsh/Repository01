package org.testing.utilities;

import java.util.Random;

public class RandonIDGenerator 
{
	public static int randomid()
	{
		Random r=new Random();
		Integer randomidvalue=r.nextInt();
		return randomidvalue;
	}

}
