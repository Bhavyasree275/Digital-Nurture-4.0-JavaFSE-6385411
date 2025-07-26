import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
    };
  }
  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then((response) => response.json())
      .then((data) => {
        const postObjects = data.map((item) => new Post(item.id, item.title, item.body));
        this.setState({ posts: postObjects });
      })
      .catch((error) => {
        throw new Error('Error fetching posts');
      });
  }
  componentDidMount() {
    this.loadPosts();
  }
    render() {
    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map((post) => (
          <div key={post.id} style={{ border: "1px solid #ccc", padding: "10px", margin: "10px 0" }}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
  componentDidCatch(error, info) {
    alert("An error occurred: " + error.message);
    console.error("Error info:", info);
  }
}
export default Posts;

