import React, { useState, useCallback } from 'react';
import styled from 'styled-components';
import TodoForm from '../../components/todo/TodoForm';
import TodoList from '../../components/todo/TodoList';

const ContentBox = styled.div`
  box-sizing: border-box;
  width: 100%;
  max-width: 720px;
  margin: 0 auto;
  background: #f8f8f8;
  padding: 25px;

  * {
    box-sizing: border-box;
  }
`;

const TodoContainer = () => {
  const [todos, setTodos] = useState([]);
  const [title, setTitle] = useState('');

  const onSubmit = useCallback(
    (e) => {
      e.preventDefault();

      setTodos((todos) =>
        todos.concat({
          id: todos.length + 1,
          title,
        }),
      );
    },
    [title],
  );

  const onChange = useCallback(
    (e) => setTitle(() => e.currentTarget.value.trim()),
    [],
  );

  return (
    <ContentBox>
      <TodoForm onSubmit={onSubmit} onChange={onChange} />
      <TodoList todos={todos} />
    </ContentBox>
  );
};

export default React.memo(TodoContainer);
