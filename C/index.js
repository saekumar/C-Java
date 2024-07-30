const countdownNumber = parseInt(process.argv[2])
const message = process.argv.slice(3).join(' ')

// Function to format seconds into "MM'SS" format
const formatTime = (seconds) => {
  const minutes = Math.floor(seconds / 60)
  const remainingSeconds = seconds % 60
  return `${minutes}'${remainingSeconds.toString().padStart(2, '0')}`
}

for (let i = countdownNumber; i >= 1; i--) {
  if (i > 60) {
    console.log(formatTime(i))
  } else {
    console.log(i)
  }
}

for (let i = 10; i >= 1; i--) {
  console.log(`${i}...`)
}

console.log(`${message.toUpperCase()}!`)
