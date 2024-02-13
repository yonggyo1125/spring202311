import { useState } from 'react';
import styles from './CSSModule.module.scss';
import classNames from 'classnames';

const CSSModule = ({ name }) => {
  const [active, setActive] = useState(false);

  return (
    <>
      <header className={styles.wrap}>
        반갑습니다.
        <span className={classNames('title', { on: active })}>{name}</span>님..
      </header>
      <button type="button" onClick={() => setActive(!active)}>
        클릭!
      </button>
    </>
  );
};

export default CSSModule;
