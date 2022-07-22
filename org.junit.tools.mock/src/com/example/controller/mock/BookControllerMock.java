package com.example.controller.mock;

import java.util.List;

import javax.annotation.processing.Generated;

import com.example.controller.BookController;

/** Mock for { @link BookController } */
@Generated(value = "org.junit-tools-1.1.0")
public class BookControllerMock extends MockUp<BookController> {

	private boolean findAllMocked = false;
	private int findAllExecutions = 0;
	private List<Book> findAllReturnValue = null;
	private boolean findOneByIsMocked = false;
	private int findOneByIsExecutions = 0;
	private ResponseEntity<Book> findOneByIsReturnValue = null;
	private boolean createMocked = false;
	private int createExecutions = 0;
	private ResponseEntity<Book> createReturnValue = null;
	private boolean updateMocked = false;
	private int updateExecutions = 0;
	private ResponseEntity<Book> updateReturnValue = null;
	private boolean deleteMocked = false;
	private int deleteExecutions = 0;
	private ResponseEntity<Book> deleteReturnValue = null;
	private boolean deleteAllMocked = false;
	private int deleteAllExecutions = 0;
	private ResponseEntity<Book> deleteAllReturnValue = null;

	public static BookControllerMock create() {
		return new BookControllerMock();
	}

	@MethodRef(name = "findAll", signature = "()QList<QBook;>;")
	@Mock
	List<Book> findAll(Invocation inv) {
		findAllExecutions++;
		if (findAllMocked) {
			return findAllReturnValue;
		}
		return inv.proceed();
	}

	public void setUpMockFindAll(List<Book> returnValue) {
		findAllReturnValue = returnValue;
		findAllMocked = true;
		findAllExecutions = 0;
	}

	public int getFindAllExecutions() {
		return findAllExecutions;
	}

	public boolean isFindAllExecuted() {
		return findAllExecutions > 0;
	}

	public void resetMockFindAll() {
		findAllMocked = false;
		findAllExecutions = 0;
	}

	@MethodRef(name = "findOneByIs", signature = "(QLong;)QResponseEntity<QBook;>;")
	@Mock
	ResponseEntity<Book> findOneByIs(Invocation inv, Long id) {
		findOneByIsExecutions++;
		if (findOneByIsMocked) {
			return findOneByIsReturnValue;
		}
		return inv.proceed();
	}

	public void setUpMockFindOneByIs(ResponseEntity<Book> returnValue) {
		findOneByIsReturnValue = returnValue;
		findOneByIsMocked = true;
		findOneByIsExecutions = 0;
	}

	public int getFindOneByIsExecutions() {
		return findOneByIsExecutions;
	}

	public boolean isFindOneByIsExecuted() {
		return findOneByIsExecutions > 0;
	}

	public void resetMockFindOneByIs() {
		findOneByIsMocked = false;
		findOneByIsExecutions = 0;
	}

	@MethodRef(name = "create", signature = "(QBook;)QResponseEntity<QBook;>;")
	@Mock
	ResponseEntity<Book> create_1(Invocation inv, Book book) {
		createExecutions++;
		if (createMocked) {
			return createReturnValue;
		}
		return inv.proceed();
	}

	public void setUpMockCreate(ResponseEntity<Book> returnValue) {
		createReturnValue = returnValue;
		createMocked = true;
		createExecutions = 0;
	}

	public int getCreateExecutions() {
		return createExecutions;
	}

	public boolean isCreateExecuted() {
		return createExecutions > 0;
	}

	public void resetMockCreate() {
		createMocked = false;
		createExecutions = 0;
	}

	@MethodRef(name = "update", signature = "(QBook;)QResponseEntity<QBook;>;")
	@Mock
	ResponseEntity<Book> update(Invocation inv, Book book) {
		updateExecutions++;
		if (updateMocked) {
			return updateReturnValue;
		}
		return inv.proceed();
	}

	public void setUpMockUpdate(ResponseEntity<Book> returnValue) {
		updateReturnValue = returnValue;
		updateMocked = true;
		updateExecutions = 0;
	}

	public int getUpdateExecutions() {
		return updateExecutions;
	}

	public boolean isUpdateExecuted() {
		return updateExecutions > 0;
	}

	public void resetMockUpdate() {
		updateMocked = false;
		updateExecutions = 0;
	}

	@MethodRef(name = "delete", signature = "(QLong;)QResponseEntity<QBook;>;")
	@Mock
	ResponseEntity<Book> delete(Invocation inv, Long id) {
		deleteExecutions++;
		if (deleteMocked) {
			return deleteReturnValue;
		}
		return inv.proceed();
	}

	public void setUpMockDelete(ResponseEntity<Book> returnValue) {
		deleteReturnValue = returnValue;
		deleteMocked = true;
		deleteExecutions = 0;
	}

	public int getDeleteExecutions() {
		return deleteExecutions;
	}

	public boolean isDeleteExecuted() {
		return deleteExecutions > 0;
	}

	public void resetMockDelete() {
		deleteMocked = false;
		deleteExecutions = 0;
	}

	@MethodRef(name = "deleteAll", signature = "()QResponseEntity<QBook;>;")
	@Mock
	ResponseEntity<Book> deleteAll(Invocation inv) {
		deleteAllExecutions++;
		if (deleteAllMocked) {
			return deleteAllReturnValue;
		}
		return inv.proceed();
	}

	public void setUpMockDeleteAll(ResponseEntity<Book> returnValue) {
		deleteAllReturnValue = returnValue;
		deleteAllMocked = true;
		deleteAllExecutions = 0;
	}

	public int getDeleteAllExecutions() {
		return deleteAllExecutions;
	}

	public boolean isDeleteAllExecuted() {
		return deleteAllExecutions > 0;
	}

	public void resetMockDeleteAll() {
		deleteAllMocked = false;
		deleteAllExecutions = 0;
	}

	public void resetAllMocks() {
		resetMockFindAll();
		resetMockFindOneByIs();
		resetMockCreate();
		resetMockUpdate();
		resetMockDelete();
		resetMockDeleteAll();
	}
}