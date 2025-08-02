import React from 'react';
import './App.css';
import BookDetails from './components/BookDetails';
import CourseDetails from './components/CourseDetails';
import BlogDetails from './components/BlogDetails';

function App() {
  const books = [
    { bname: 'Master React', price: 670 },
    { bname: 'Deep Dive into Angular 11', price: 800 },
    { bname: 'Mongo Essentials', price: 450 }
  ];

  const courses = [
    { cname: 'Angular', date: '4/5/2021' },
    { cname: 'React', date: '6/3/2021' }
  ];

  const blogs = [
    { title: 'React Learning', author: 'Stephen Biz', content: 'Welcome to learning React!' },
    { title: 'Installation', author: 'Schwezdenier', content: 'You can install React from npm.' }
  ];

  return (
    <div className="App">
      <h1>Blogger Dashboard</h1>
      <div className="row">
        <div className="column"><CourseDetails courses={courses} /></div>
        <div className="column"><BookDetails books={books} /></div>
        <div className="column"><BlogDetails blogs={blogs} /></div>
      </div>
    </div>
  );
}

export default App;
