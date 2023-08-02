CREATE TABLE IF NOT EXISTS book
(
    -- SERIAL is auto_increment of the id
    id SERIAL PRIMARY_KEY,
    title VARCHAR(100) NOT NULL,
    author VARCHAR(100) NOT NULL,
    published_date DATE
)