import React from 'react';

function BlogDetails() {
  const blogs = [
    { id: 1, title: "Why React is Great" },
    { id: 2, title: "Understanding JSX" }
  ];

  return (
    <div>
      <h2>Blog Articles</h2>
      <ul>
        {blogs.map(blog => (
          <li key={blog.id}>{blog.title}</li>
        ))}
      </ul>
    </div>
  );
}

export default BlogDetails;
