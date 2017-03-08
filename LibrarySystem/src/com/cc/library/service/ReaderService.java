package com.cc.library.service;

import com.cc.library.domain.PageBean;
import com.cc.library.domain.Reader;

public interface ReaderService {

	public Reader getReader(Reader reader);

	public Reader updateReaderInfo(Reader reader);

	public boolean addReader(Reader reader);

	public PageBean<Reader> findReaderByPage(int pageCode, int pageSize);
}
