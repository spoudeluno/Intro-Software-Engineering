
public aspect TraceAspectPoudel {

	pointcut classToTrace(): within(componentApp) ||  within(DataApp) || within(ServiceApp);
}
