package io.metersphere.notice.domain;

import io.metersphere.base.domain.Notice;
import lombok.Data;

@Data
public class NoticeDTO extends Notice {
    private String[] names;
}
