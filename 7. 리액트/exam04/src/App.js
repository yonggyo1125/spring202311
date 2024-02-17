import { Routes, Route } from 'react-router-dom';
import loadable from '@loadable/component';
import MainLayout from './layouts/MainLayout';
const Home = loadable(() => import('./pages/Home'));
const About = loadable(() => import('./pages/About'));
const NotFound = loadable(() => import('./pages/NotFound'));

const App = () => {
  return (
    <Routes>
      <Route path="/" element={<MainLayout />}>
        <Route index element={<Home />} />
        <Route path="/about" element={<About />} />
      </Route>
      <Route path="*" element={<NotFound />} />
    </Routes>
  );
};

export default App;
