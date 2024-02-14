import React from 'react';
import TodoForm from '../../components/todo/TodoForm';
import TodoList from '../../components/todo/TodoList';

const TodoContainer = () => {
  return (
    <>
      <TodoForm />
      <TodoList />
    </>
  );
};

export default React.memo(TodoContainer);
