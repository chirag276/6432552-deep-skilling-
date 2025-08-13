import React from 'react';

const IndianPlayers = () => {
  const oddTeam = ['Virat', 'Gill', 'Iyer', 'Pant', 'Bumrah'];
  const evenTeam = ['Rohit', 'Surya', 'Jadeja', 'Ashwin', 'Shami'];

  const [player1, player2, ...restOddTeam] = oddTeam;
  const [even1, even2, ...restEvenTeam] = evenTeam;

  const T20players = ['Virat', 'Rohit', 'Gill'];
  const RanjiTrophyPlayers = ['Rahane', 'Pujara', 'Ishant'];

  const allPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {[player1, player2, ...restOddTeam].map((p, i) => <li key={i}>{p}</li>)}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {[even1, even2, ...restEvenTeam].map((p, i) => <li key={i}>{p}</li>)}
      </ul>

      <h2>Merged T20 and Ranji Trophy Players</h2>
      <ul>
        {allPlayers.map((p, i) => <li key={i}>{p}</li>)}
      </ul>
    </div>
  );
};

export default IndianPlayers;
