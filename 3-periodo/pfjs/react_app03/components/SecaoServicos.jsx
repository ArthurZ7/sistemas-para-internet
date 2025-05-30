import React from "react";
import Apresentacao from "./Apresentacao";
import Box from "./Box";

function SecaoServicos() {
    return (
        <section>
            <Apresentacao titulo="Título 1" subtitulo="Subtitulo 1"/>
            <Apresentacao titulo="Título 2" subtitulo="Subtitulo 2"/>
            <Box texto="Eleições do Conselho Superior"/>
            <Box texto="Estudo no IFTM"/>
            <Box texto="Editais"/> 
        </section>
    );
}

export default SecaoServicos;