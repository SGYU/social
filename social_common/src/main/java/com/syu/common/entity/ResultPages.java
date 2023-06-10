package com.syu.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @version V1.0
 * @auther songyu@belink.com
 * @title
 * @description
 * @data 2023-06-04 15:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResultPages<T> {
    private Long total;

    private List<T> rows;
}
