export const randomizePattern = (cipher_text) => {
  const text_length = cipher_text.length;
  let previous_number = 0;
  let next_number = 0;
  let patternParts = [];

  while (previous_number < text_length) {
    // generate a random shuffle from 1 to 26 (alphabet length)
    const shuffle = Math.floor(Math.random() * 26) + 1;

    // generate the next number within the remaining text length range
    next_number = previous_number + Math.floor(Math.random() * (text_length - previous_number)) + 1;

    // start and end indicators
    const start = previous_number === 0 ? 's' : previous_number + 1;
    const end = next_number >= text_length ? 'e' : next_number;

    // add the pattern part in the format start:end/shuffle
    patternParts.push(`${start}:${end}/${shuffle}`);

    // update previous number for the next range
    previous_number = next_number;
  }

  // combine all parts
  return patternParts.join(";");
};
