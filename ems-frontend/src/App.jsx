import { useState } from 'react'

import ListEmployeeComponent from './components/ListEmployeeComponent'
import HeaderComponent from './components/HeaderComponent'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <HeaderComponent/>
      <ListEmployeeComponent />
    </>
  )
}

export default App
