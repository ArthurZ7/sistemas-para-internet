import React from 'react'
// import Apresentacao from './components/Apresentacao'
// import Box from './components/Box'
import './App.css'
import Footer from './components/Footer';
import Header from './components/Header';
import Main from './components/Main';

function App() {
  return (
    <>
      {/* <Apresentacao titulo="Título 1" subtitulo="Subtitulo 1"/>
      <Apresentacao titulo="Título 2" subtitulo="Subtitulo 2"/>
      <Box texto="Eleições do Conselho Superior"/>
      <Box texto="Estudo no IFTM"/>
      <Box texto="Editais"/> */}

      <Header/>
      <Main/>
      <Footer/>
    </>
  );
}

export default App
