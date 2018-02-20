package org.sample.contracts.usecase;

public interface UseCase<R extends Request, O extends Response> {
	void execute(R request, O response);
}
