import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  const [view, setView] = useState('book');
  const [showCourse, setShowCourse] = useState(true);

  const renderView = () => {
    if (view === 'book') {
      return <BookDetails />;
    } else if (view === 'blog') {
      return <BlogDetails />;
    } else {
      return <p>Select a view</p>;
    }
  };

  return (
    <div style={{ textAlign: 'center' }}>
      <h1>Blogger App Dashboard</h1>
      <button onClick={() => setView('book')}>Show Book</button>
      <button onClick={() => setView('blog')}>Show Blog</button>
      <button onClick={() => setShowCourse(!showCourse)}>
        {showCourse ? 'Hide' : 'Show'} Course
      </button>
      <hr />
      {renderView()}
      {showCourse && <CourseDetails />}
    </div>
  );
}

export default App;
