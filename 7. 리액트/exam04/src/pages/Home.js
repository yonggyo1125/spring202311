import React, { useState, Suspense } from 'react';
import { Link } from 'react-router-dom';
import loadable from '@loadable/component';

const Home = () => {
  //const SplitMe = React.lazy(() => import('../components/SplitMe'));
  const SplitMe = loadable(() => import('../components/SplitMe'), {
    fallback: <div>Loading...</div>,
  });

  const [visible, setVisible] = useState(false);

  const onClick = () => setVisible(true);

  return (
    <>
      <h1>Home!</h1>
      <Link to="/about">About 페이지 이동</Link>
      <button type="button" onClick={onClick}>
        클릭!
      </button>
      {visible && <SplitMe />}
      {/*
      <Suspense fallback={<div>Loading....</div>}>
        {visible && <SplitMe />}
      </Suspense>
    */}
    </>
  );
};

export default React.memo(Home);
