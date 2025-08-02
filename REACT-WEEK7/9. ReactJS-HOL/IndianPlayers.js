import React from 'react';

const IndianPlayers = () => {
  // Example player names with numbers for clarity
  const team = ['Sachin1', 'Dhoni2', 'Virat3', 'Rohit4', 'Yuvraj5', 'Raina6'];

  // Destructure the players
  const [first, second, third, fourth, fifth, sixth] = team;

  const oddTeam = [
    { position: 'First', name: first },
    { position: 'Third', name: third },
    { position: 'Fifth', name: fifth }
  ];

  const evenTeam = [
    { position: 'Second', name: second },
    { position: 'Fourth', name: fourth },
    { position: 'Sixth', name: sixth }
  ];

  // Merge two arrays using ES6 spread operator
  const T20Players = ['Mr. First Player', 'Mr. Second Player'];
  const RanjiTrophyPlayers = ['Mr. Third Player', 'Mr. Fourth Player'];
  const mergedPlayers = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Players</h2>
      <ul>
        {oddTeam.map((p, i) => (
          <li key={i}>
            {p.position} : {p.name}
          </li>
        ))}
      </ul>

      <h2>Even Players</h2>
      <ul>
        {evenTeam.map((p, i) => (
          <li key={i}>
            {p.position} : {p.name}
          </li>
        ))}
      </ul>

      <h2>List of Indian Players Merged:</h2>
      <ul>
        {mergedPlayers.map((p, i) => (
          <li key={i}>{p}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
