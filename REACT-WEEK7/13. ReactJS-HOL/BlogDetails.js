import React from 'react';

function BlogDetails({ blogs }) {
  return (
    <div>
      <h2>Blog Details</h2>
      <ul style={{ listStyle: 'none', padding: 0 }}>
        {blogs.map((blog, index) => (
          <div key={index}>
            <h3>{blog.title}</h3>
            <h4>{blog.author}</h4>
            <p>{blog.content}</p>
          </div>
        ))}
      </ul>
    </div>
  );
}

export default BlogDetails;
