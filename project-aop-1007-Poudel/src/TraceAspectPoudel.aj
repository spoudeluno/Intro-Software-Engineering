
public aspect TraceAspectPoudel {

	pointcut classToTrace(): within(ComponentApp) ||  within(DataApp) || within(ServiceApp);
	pointcut methotToTrace(): classToTrace() && execution(* *(..));
	before():methotToTrace() {
		String info = thisJoinPointStaticPart.getSignature() + "," + thisJoinPointStaticPart.getSourceLocation().getLine();
		System.out.println("[BGN]" + info);
	}
	after():methotToTrace(){
		String info = thisJoinPointStaticPart.getSourceLocation().getFileName();
		System.out.println("[END]" + info);
	}

	
}
