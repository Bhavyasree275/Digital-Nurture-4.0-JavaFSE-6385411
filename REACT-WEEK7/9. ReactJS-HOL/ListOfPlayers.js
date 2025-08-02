import React from 'react';

const ListOfPlayers = () => {
  let players = [
    { name: 'Virat', score: 95 },
    { name: 'Rohit', score: 88 },
    { name: 'Gill', score: 76 },
    { name: 'Dhoni', score: 45 },
    { name: 'Pant', score: 50 },
    { name: 'Jadeja', score: 66 },
    { name: 'Kohli', score: 92 },
    { name: 'Ashwin', score: 30 },
    { name: 'Bumrah', score: 25 },
    { name: 'Rahul', score: 78 },
    { name: 'Shami', score: 55 }
  ];

  const allPlayers = players.map((player, index) => (
    <li key={index}>{player.name} - {player.score}</li>
  ));

  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>{allPlayers}</ul>

      <h2>Players Scoring Below 70</h2>
      <ul>
        {lowScorers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListOfPlayers;
