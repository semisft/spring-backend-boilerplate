package in.clouthink.daas.sbb.notice.service;

import in.clouthink.daas.sbb.account.domain.model.User;
import in.clouthink.daas.sbb.notice.domain.model.Notice;
import in.clouthink.daas.sbb.notice.domain.model.NoticeReadHistory;
import in.clouthink.daas.sbb.notice.domain.request.NoticeQueryRequest;
import in.clouthink.daas.sbb.notice.domain.request.SaveNoticeRequest;
import in.clouthink.daas.sbb.shared.domain.request.PageQueryRequest;
import org.springframework.data.domain.Page;

/**
 *
 */
public interface NoticeService {

	Page<Notice> listNotices(NoticeQueryRequest queryParameter);

	Notice findNoticeById(String id);

	void markNoticeAsRead(Notice notice, User user);

	boolean isNoticeReadByUser(Notice notice, User user);

	int countNoticeReadHistory(Notice notice);

	Notice createNotice(SaveNoticeRequest notice, User user);

	void updateNotice(String id, SaveNoticeRequest notice, User user);

	void deleteNotice(String id, User user);

	void publishNotice(String id, User user);

	void unpublishNotice(String id, User user);

	Page<NoticeReadHistory> listReadHistory(String id, PageQueryRequest queryRequest);

}