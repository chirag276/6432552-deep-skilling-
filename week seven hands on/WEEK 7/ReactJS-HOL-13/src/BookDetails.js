import React from 'react';

function BookDetails() {
  const books = [
    { id: 1, title: "React Basics", author: "John Doe" },
    { id: 2, title: "Advanced React", author: "Jane Smith" }
  ];

  return (
    <div>
      <h2>Book Details</h2>
      {books.map(book => (
        <div key={book.id}>
          <strong>{book.title}</strong> by {book.author}
        </div>
      ))}
    </div>
  );
}

export default BookDetails;
