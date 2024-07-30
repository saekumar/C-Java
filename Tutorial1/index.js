const data = {
  id: '0001',
  type: 'donut',
  name: 'Cake',
  ppu: 0.55,
  batters: {
    batter: [
      { id: '1001', type: 'Regular' },
      { id: '1002', type: 'Chocolate' },
      { id: '1003', type: 'Blueberry' },
      { id: '1004', type: "Devil's Food" },
    ],
  },
  toppings: {
    topping: [
      { id: '5001', type: 'None' },
      { id: '5002', type: 'Glazed' },
      { id: '5005', type: 'Sugar' },
      { id: '5007', type: 'Powdered Sugar' },
      { id: '5006', type: 'Chocolate with Sprinkles' },
      { id: '5003', type: 'Chocolate' },
      { id: '5004', type: 'Maple' },
    ],
  },
}

// Helper function to extract headers and flatten the object structure
function extractHeadersAndValues(data) {
  const headers = []
  const rows = []

  function traverse(obj, path = []) {
    if (Array.isArray(obj)) {
      obj.forEach((item, index) => traverse(item, [...path, index]))
    } else if (typeof obj === 'object' && obj !== null) {
      Object.keys(obj).forEach((key) => traverse(obj[key], [...path, key]))
    } else {
      headers.push(path.join('_'))
    }
  }

  traverse(data)

  function extractValues(obj, path = []) {
    const row = new Array(headers.length).fill('')
    function traverseAndAssignValues(obj, path = []) {
      if (Array.isArray(obj)) {
        obj.forEach((item, index) =>
          traverseAndAssignValues(item, [...path, index])
        )
      } else if (typeof obj === 'object' && obj !== null) {
        Object.keys(obj).forEach((key) =>
          traverseAndAssignValues(obj[key], [...path, key])
        )
      } else {
        const header = path.join('_')
        const index = headers.indexOf(header)
        row[index] = obj
      }
    }
    traverseAndAssignValues(obj, path)
    rows.push(row)
  }

  extractValues(data)

  if (data.batters && data.batters.batter) {
    data.batters.batter.forEach((batter) =>
      extractValues(batter, ['batters', 'batter'])
    )
  }

  if (data.toppings && data.toppings.topping) {
    data.toppings.topping.forEach((topping) =>
      extractValues(topping, ['toppings', 'topping'])
    )
  }

  return { headers, rows }
}

const { headers, rows } = extractHeadersAndValues(data)

// Add 'data' to the start of the headers and rows for alignment
headers.unshift('data')
rows.forEach((row) => row.unshift(''))

// Print the headers
console.log(headers.join('\t'))

// Print each row of values
rows.forEach((row) => console.log(row.join('\t')))
