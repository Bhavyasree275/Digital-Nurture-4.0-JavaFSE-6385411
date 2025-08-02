import React from 'react';

function CourseDetails({ courses }) {
  return (
    <div>
      <h2>Course Details</h2>
      <ul style={{ listStyle: 'none', padding: 0 }}>
        {courses.map((course, index) => (
          <div key={index}>
            <h3>{course.cname}</h3>
            <h4>{course.date}</h4>
          </div>
        ))}
      </ul>
    </div>
  );
}

export default CourseDetails;
