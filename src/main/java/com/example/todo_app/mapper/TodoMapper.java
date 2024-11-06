package com.example.todo_app.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.todo_app.model.Todo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Tomfe
 * @description 针对表【todo】的数据库操作Mapper
 * @createDate 2024-11-06 00:29:07
 * @Entity generator.domain.Todo
 */
@Mapper
public interface TodoMapper extends BaseMapper<Todo> {

}




