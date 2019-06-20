package test;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;


public class Test {

	public static void main(String[] args) {
		//		ComThread.InitMTA(true);
		ActiveXComponent com = new ActiveXComponent("CLSID:B3B938C4-4190-4F37-8CF0-A92B0A91CC77") ;
		Dispatch disp = com.getObject();

		Dispatch.callSub(disp, "NSDetachedSignBySN");
		
		System.out.println(Dispatch.get(disp, "ErrCode"));
		System.out.println(Dispatch.get(disp, "ErrMsg"));



		//        ComThread.Release();    

	}

}
