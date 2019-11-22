-- Users
-- In the real world we would encrypt password
INSERT INTO USER (name, email, username, password)
VALUES ( 'Rick Duckworth', 'rduckworth2000@yahoo.com', 'user', 'password' );

-- NFL Teams
INSERT INTO NFL_TEAM (name)
VALUES ( 'Arizona Cardinals' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Atlanta Falcons' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Baltimore Ravens' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Buffalo Bills' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Carolina Panthers' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Chicago Bears' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Cincinnati Bengals' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Cleveland Browns' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Dallas Cowboys' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Denver Broncos' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Detroit Lions' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Green Bay Packers' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Houston Texans' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Indianapolis Colts' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Jacksonville Jaguars' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Kansas City Chiefs' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Los Angeles Chargers' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Los Angeles Rams' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Miami Dolphins' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Minnesota Vikings' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'New England Patriots' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'New Orleans Saints' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'New York Giants' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'New York Jets' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Oakland Raiders' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Philadelphia Eagles' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Pittsburgh Steelers' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'San Francisco 49ers' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Seattle Seahawks' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Tampa Bay Buccaneers' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Tennessee Titans' );

INSERT INTO NFL_TEAM (name)
VALUES ( 'Washington Redskins' );

-- Positions
INSERT INTO POSITION (name, abbreviation)
VALUES ( 'Quarterback', 'QB' );

INSERT INTO POSITION (name, abbreviation)
VALUES ( 'Running Back', 'RB' );

INSERT INTO POSITION (name, abbreviation)
VALUES ( 'Wide Receiver', 'WR' );

INSERT INTO POSITION (name, abbreviation)
VALUES ( 'Tight End', 'TE' );

INSERT INTO POSITION (name, abbreviation)
VALUES ( 'Place Kicker', 'PK' );

INSERT INTO POSITION (name, abbreviation)
VALUES ( 'Defense', 'Def' );

-- Players
INSERT INTO PLAYER (name, position_id)
VALUES ( 'Dak Prescott', 1 );

INSERT INTO PLAYER (name, position_id)
VALUES ( 'Aaron Rodgers', 1 );

INSERT INTO PLAYER (name, position_id)
VALUES ( 'Ryquell Armstead', 2 );

INSERT INTO PLAYER (name, position_id)
VALUES ( 'Ezekiel Elliot', 2 );

INSERT INTO PLAYER (name, position_id)
VALUES ( 'Josh Jacobs', 2 );

INSERT INTO PLAYER (name, position_id)
VALUES ( 'Jaylen Samuels', 2 );

INSERT INTO PLAYER (name, position_id)
VALUES ( 'Brandin Cooks', 3 );

INSERT INTO PLAYER (name, position_id)
VALUES ( 'Tyreek Hill', 3 );

INSERT INTO PLAYER (name, position_id)
VALUES ( 'Marvin Jones', 3 );

INSERT INTO PLAYER (name, position_id)
VALUES ( 'Demarcus Robinson', 3 );

INSERT INTO PLAYER (name, position_id)
VALUES ( 'Deebo Samuel', 3 );

INSERT INTO PLAYER (name, position_id)
VALUES ( 'Emmanuel Sanders', 3 );

INSERT INTO PLAYER (name, position_id)
VALUES ( 'Darren Fells', 4 );

INSERT INTO PLAYER (name, position_id)
VALUES ( 'Austin Hooper', 4 );

INSERT INTO PLAYER (name, position_id)
VALUES ( 'Greg Zuerlein', 5 );

INSERT INTO PLAYER (name, position_id)
VALUES ( 'Oakland Raiders', 6 );

-- Fantasy Teams