package com.cll.pojo;

/**
 * @author ：leleChang
 * @date ：Created in 2020/5/22 15:16
 * @description：
 * @modified By：
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;

}