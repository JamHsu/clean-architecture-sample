package org.sample.usecase.contracts;

public interface UseCase<R extends Request, O extends Response> {
	void execute(R request, O response);
}
