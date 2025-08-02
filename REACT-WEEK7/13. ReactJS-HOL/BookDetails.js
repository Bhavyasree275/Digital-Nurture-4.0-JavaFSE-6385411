import React from 'react';

function BookDetails({ books }) {
  return (
    <div>
      <h2>Book Details</h2>
      <ul style={{ listStyle: 'none', padding: 0 }}>
        {books.map((book, index) => (
          <div key={index}>
            <h3>{book.bname}</h3>
            <h4>{book.price}</h4>
          </div>
        ))}
      </ul>
    </div>
  );
}

export default BookDetails;
